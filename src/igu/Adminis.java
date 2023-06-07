package igu;

import java.awt.Color;
import java.awt.Graphics;
import logica.BaseDeDatos;

public class Adminis extends javax.swing.JFrame {

    BaseDeDatos bd;
    
    public Adminis(BaseDeDatos bd) {
        initComponents();
        this.bd = bd;
    }

    boolean graficarCarreras = false;
    boolean graficarHora = false;
    
    Color[] listaColores = {new Color(255,0,0), new Color(0,130,0), new Color(0,0,255), new Color(130,130,0), 
                new Color(0,130,130), new Color(130,0,130), new Color(0,255,0)};
    
    String[] listaCarreras = {"Electronica","Mecatronica","Electronica","Administracion","Administracion","Ingieneria Industrial","Administracion","Sistemas","Sistemas","Ingieneria Mecanica"};

    int[] listaHoras = {7,8,8,9,6,7,6,8,8,9,9,8,8,9,8};
    //int[] listaHoras = {7,8,9,6};
      //      int[] repeticionHoras= {2,7,3,2};
            
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        frmGraficos = new javax.swing.JPanel();
        cmbGrafica = new javax.swing.JComboBox<>();
        btnGraficar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        frmGraficos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 255)));

        javax.swing.GroupLayout frmGraficosLayout = new javax.swing.GroupLayout(frmGraficos);
        frmGraficos.setLayout(frmGraficosLayout);
        frmGraficosLayout.setHorizontalGroup(
            frmGraficosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 621, Short.MAX_VALUE)
        );
        frmGraficosLayout.setVerticalGroup(
            frmGraficosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 516, Short.MAX_VALUE)
        );

        cmbGrafica.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hora de llegada", "Estudiantes" }));
        cmbGrafica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbGraficaActionPerformed(evt);
            }
        });

        btnGraficar.setText("Graficar");
        btnGraficar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGraficarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cmbGrafica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(400, 400, 400)
                        .addComponent(btnGraficar, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(frmGraficos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbGrafica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGraficar))
                .addGap(18, 18, 18)
                .addComponent(frmGraficos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbGraficaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbGraficaActionPerformed

    }//GEN-LAST:event_cmbGraficaActionPerformed

    private void btnGraficarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGraficarActionPerformed
           graficarHora = false;
           graficarCarreras = false;   
           
           
        switch(cmbGrafica.getSelectedIndex()){

           case 0:
               //Horas
               crearHoraLlegadaUnica();
               
               graficarHora = true;
               repaint();
               break;
               
           case 1:
               //Carreras
               
               graficarCarreras = true;
               repaint();
               
               
               break;

       }
    }//GEN-LAST:event_btnGraficarActionPerformed
    @Override
    public void paint(Graphics g){
        super.paint(g);
        if(graficarCarreras){
            

            String[] listaCampos = this.crearListaCarrerasUnicas();
            int entradaCampos[]=repeticionListaCarrerasUnicas(listaCampos);

            
            
            int totalEntradas = 0;//Suma de todas las entradas
            for(int i=0;i<entradaCampos.length;i++){
                totalEntradas+=entradaCampos[i];
            }
            
            
            int gradosPorCampo[]= new int[listaCampos.length];

            for(int i=0;i<listaCampos.length;i++){ //Por cada diferente campo
                gradosPorCampo[i] = entradaCampos[i] * 360 / totalEntradas;
            } 

            
            
            int ultimoGrado = 0;
            for(int i=0;i<listaCampos.length;i++){ //Por cada diferente campo
                g.setColor(listaColores[i]);
                g.fillArc(90, 180, 100, 100, ultimoGrado, gradosPorCampo[i]);
                ultimoGrado += gradosPorCampo[i];
                
                //Labels
                g.fillRect(350,230 + (i*-30) , 20, 20);
                g.drawString(listaCampos[i], 375, 245 +(-30*i));
            }   
        }
        
        if(graficarHora){
            int[] listaHoras = crearHoraLlegadaUnica();
            int[] repeticionHoras= repeticionListaHoraLlegada(listaHoras);
            int valorMaximo = 7;
            
            int[] listaLargo= new int[listaHoras.length];
            for(int i=0; i<listaHoras.length; i++){
                listaLargo[i] =repeticionHoras[i] *500 /valorMaximo;
            }
            
            for(int i=0; i<=24; i++){//Todas las barras
                g.setColor(Color.BLUE);
                
                if(contieneValor(listaHoras,i)){
                    //Si esta en la lista
                    g.fillRect(100,100 +(20*i), listaLargo[indexOf(i,listaHoras)], 10);
                    
                } else{
                    //No esta en la lista    
                }
                g.setColor(Color.BLACK);
                g.drawString(i+":00", 60, 112+(20*i));
                
            }
            
            
        }
    }
    
    public static boolean contieneValor(int[] lista, int valor){
        boolean bandera = false;
        for(int i=0; (i<lista.length); i++){
            if(lista[i]==valor){
                bandera = true;
            }
        }
        return bandera;
    }
    
    public static boolean contieneValor(String[] lista, String valor){
        if(lista.length==0){
            return false;
        }
        
        
        boolean bandera = false;
        for(int i=0; (i<lista.length); i++){
            if(lista[i].equalsIgnoreCase(valor)){
                bandera = true;
            }
        }
        return bandera;
    }
    
    public static int indexOf(int valor, int[] lista){
        int salida = 0;
        

        for (int i=0; i<lista.length;i++){
            if(valor == lista[i]){
                salida = i;
            }
            
        }
        return salida;
    }
    
    public static int indexOf(String valor, String[] lista){
        int salida = 0;
        for (int i=0; i<lista.length;i++){
            if(valor.equalsIgnoreCase(lista[i])){
                salida = i;
            }
            
        }
        return salida;
    }
    
    public String[] crearHorasLlegada(){
        String[] salida  = {"8","9","7","10","11","13","9","6","6","7","6"};
        //ESTO ES DOINDE SE CREA LA LISTA DE HORAS DE LLEGADA
        
        
        
        return salida;
    }
    
    public  String[] crearListaCarrerasUnicas(){
        String[] entrada  = listaCarreras;
        //---------Cantidad de carreras
        String[] valoresAlmacenados= new String[entrada.length];
        //Llenar
        for(int i=0;i<entrada.length;i++){
            valoresAlmacenados[i]= "";
        }
        
        int cantidadDeCampos=0;
        for(int i=0; i<entrada.length;i++){
            if(contieneValor(valoresAlmacenados,entrada[i])){
               //Ya esta
                
                
            } else{ //No esta
                valoresAlmacenados[i]= entrada[i];
                cantidadDeCampos++;
            }
        }
        
        
        //Crear lista de valores
        String[] listaCarrerasUnicas= new String[cantidadDeCampos];
        
        //InicialisarLista
        int camposLlenados=0;
        for(int i=0;i<cantidadDeCampos;i++){
            listaCarrerasUnicas[i]="";
        }
        
        
        //Llenar lista
        camposLlenados=0;//Cuantos campos llevo llenados
        for(int i=0;i<entrada.length;i++){
            if(contieneValor(listaCarrerasUnicas,entrada[i])){ 
                //Ya esta
                
                
            } else{ //No esta
                listaCarrerasUnicas[camposLlenados]=entrada[i]; 
                System.out.println("carreras unicas "+listaCarrerasUnicas[camposLlenados]);
                camposLlenados++;
                
            }
            
        }
        
        return listaCarrerasUnicas;
   
    }

    public int[] repeticionListaCarrerasUnicas(String[] carrerasUnicas){
        //Nueva lsita de salida
        int[] listaRepeticiones= new int[carrerasUnicas.length];
        
        //Llenar
        for(int i=0;i<listaRepeticiones.length;i++){
            listaRepeticiones[i]=0;
        }
        
        boolean bandera=false;
        int index=0;
        for(int i=0;i<listaCarreras.length;i++){//Toda mi lista original
            for(int j=0;j<carrerasUnicas.length;j++){//Toda la lista unica
                if(listaCarreras[i].contentEquals(carrerasUnicas[j])){
                    index=j;
                }
                
                
            }
            
            listaRepeticiones[index]++;
        }
        return listaRepeticiones;
    }
    
    public int[] crearHoraLlegadaUnica(){
        int[] entrada = listaHoras;
        
        //Contar cuantos horas de entradas tengo
            int[] valoresAlmacenados= new int[entrada.length];
            //Llenar
            for(int i=0;i<entrada.length;i++){
                valoresAlmacenados[i]= 0;
            }

            int cantidadDeCampos=0;
            for(int i=0; i<entrada.length;i++){
                if(contieneValor(valoresAlmacenados,entrada[i])){
                   //Ya esta


                } else{ //No esta
                    valoresAlmacenados[i]= entrada[i];
                    cantidadDeCampos++;
                }
            }
        
        //Crear lista de valores
        int[] listaHorasUnicas= new int[cantidadDeCampos];
        
        //InicialisarLista
        int camposLlenados=0;
        for(int i=0;i<cantidadDeCampos;i++){
            listaHorasUnicas[i]=0;
        }
        
        
        //Llenar lista
        camposLlenados=0;//Cuantos campos llevo llenados
        for(int i=0;i<entrada.length;i++){
            if(contieneValor(listaHorasUnicas,entrada[i])){ 
                //Ya esta
                
            } else{ //No esta
                listaHorasUnicas[camposLlenados]=entrada[i]; 
                System.out.println("hora unica "+listaHorasUnicas[camposLlenados]);
                camposLlenados++;
            }  
        }
        
        return listaHorasUnicas;
    }
    
    public int[] repeticionListaHoraLlegada(int[] horasUnicas){
        //Nueva lsita de salida
        int[] listaRepeticiones= new int[horasUnicas.length];
        
        //Llenar
        for(int i=0;i<listaRepeticiones.length;i++){
            listaRepeticiones[i]=0;
        }
        
        boolean bandera=false;
        int index=0;
        for(int i=0;i<listaHoras.length;i++){//Toda mi lista original
            for(int j=0;j<horasUnicas.length;j++){//Toda la lista unica
                if(listaHoras[i]==(horasUnicas[j])){
                    index=j;
                }
                
                
            }
            
            listaRepeticiones[index]++;
        }
        return listaRepeticiones;
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGraficar;
    private javax.swing.JComboBox<String> cmbGrafica;
    private javax.swing.JPanel frmGraficos;
    // End of variables declaration//GEN-END:variables
}
