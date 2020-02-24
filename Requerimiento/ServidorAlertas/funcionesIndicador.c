#include "alertas.h"
#include "notificaciones.h"
#include <stdio_ext.h>

int calcularPuntuacion(alerta * parAlerta, nodo_paciente parPaciente){
    
    int indicadores=0;

  

    /**Nacimiento - 6 Semanas**/
    if(parPaciente.edad<0.13){
        printf("Edad del paciente:Nacimiento - 6 Semanas\n");
        //Frecuencia Cardiaca
        if( parPaciente.indicadores.frecuenciaCardiaca<120 || parPaciente.indicadores.frecuenciaCardiaca>140){
            char str[10];
            sprintf(str, "%d", parPaciente.indicadores.frecuenciaCardiaca);
            strcpy(parAlerta->generoAlerta[indicadores].nombreIndicador,"Frecuencia Cardiaca");
            strcpy(parAlerta->generoAlerta[indicadores].valor, str);
            indicadores +=1;
            printf("Alerta #%d: [120 - 140] => %d FRECUENCIA CARDIACA\n",indicadores,parPaciente.indicadores.frecuenciaCardiaca);
            
        }
        


          //Tension Arterial Sistolica
        if((parPaciente.indicadores.sPresionArterial.sistolica<70 || parPaciente.indicadores.sPresionArterial.sistolica>100) || (parPaciente.indicadores.sPresionArterial.diastolica<50 || parPaciente.indicadores.sPresionArterial.diastolica>68)){
            char sistolica[10];
            char diastolica[10];
            char str[10];
            if(parPaciente.indicadores.sPresionArterial.sistolica<70 || parPaciente.indicadores.sPresionArterial.sistolica>100){
                
                sprintf(sistolica, "%d", parPaciente.indicadores.sPresionArterial.sistolica);
               printf("Alerta #%d: [70 - 100] => %d PRESION ARTERIAL SISTOLICA \n",indicadores,parPaciente.indicadores.sPresionArterial.sistolica); 
            }
            if(parPaciente.indicadores.sPresionArterial.diastolica<50 || parPaciente.indicadores.sPresionArterial.diastolica>68){
                //Tensión Arterial Distólica
    
                sprintf(diastolica, "%d", parPaciente.indicadores.sPresionArterial.diastolica);
                printf("Alerta #%d: [50 - 68] => %d PRESION ARTERIAL DISTOLICA \n",indicadores,parPaciente.indicadores.sPresionArterial.diastolica);                   
        
            }
            strcpy(parAlerta->generoAlerta[indicadores].nombreIndicador,"Frecuencia Arterial");
            sprintf(str,"%s %s ",sistolica,diastolica);
            strcpy(parAlerta->generoAlerta[indicadores].valor, str);
            indicadores +=1;   
                    
        }
        //Frecuencia Respiratoria
        if( parPaciente.indicadores.frecuenciaRespiratoria<40 || parPaciente.indicadores.frecuenciaRespiratoria>45){
            char str[10];
            sprintf(str, "%d", parPaciente.indicadores.frecuenciaRespiratoria);
            strcpy(parAlerta->generoAlerta[indicadores].nombreIndicador,"Frecuencia Respiratoria");
            strcpy(parAlerta->generoAlerta[indicadores].valor, str);
            indicadores +=1;  
            printf("Alerta #%d: [40 - 45] => %d FRECUENCIA RESPIRATORIA \n",indicadores,parPaciente.indicadores.frecuenciaRespiratoria);                                     
        }
        //Temperatura
        if( parPaciente.indicadores.temperatura != 38){
            char str[10];
            sprintf(str, "%.2f", parPaciente.indicadores.temperatura);
            strcpy(parAlerta->generoAlerta[indicadores].nombreIndicador,"Temperatura");
            strcpy(parAlerta->generoAlerta[indicadores].valor, str);
            indicadores +=1;   
            printf("Alerta #%d: [38] => %d TEMPERATURA \n",indicadores,parPaciente.indicadores.temperatura);            
        }
    }

    /**7 Semanas - 1 año**/
    if(parPaciente.edad>0.13 && parPaciente.edad<1){
        printf("Edad del paciente: 7 semanas - 1 año\n");
        //Frecuencia Cardiaca
        if( parPaciente.indicadores.frecuenciaCardiaca<100 || parPaciente.indicadores.frecuenciaCardiaca>130){
            char str[10];
            sprintf(str, "%d", parPaciente.indicadores.frecuenciaCardiaca);
            strcpy(parAlerta->generoAlerta[indicadores].nombreIndicador,"Frecuencia Cardiaca");
            strcpy(parAlerta->generoAlerta[indicadores].valor, str);
            indicadores +=1;
            printf("Alerta #%d: [100 - 130] => %d FRECUENCIA CARDIACA\n",indicadores,parPaciente.indicadores.frecuenciaCardiaca);
        }
        

          //Tension Arterial Sistolica
        if((parPaciente.indicadores.sPresionArterial.sistolica<84 || parPaciente.indicadores.sPresionArterial.sistolica>106) || (parPaciente.indicadores.sPresionArterial.diastolica<56 || parPaciente.indicadores.sPresionArterial.diastolica>70)){
            char sistolica[10];
            char diastolica[10];
            char str[10];
            if(parPaciente.indicadores.sPresionArterial.sistolica<84 || parPaciente.indicadores.sPresionArterial.sistolica>106){
                
                sprintf(sistolica, "%d", parPaciente.indicadores.sPresionArterial.sistolica);
               printf("Alerta #%d: [84 - 106] => %d PRESION ARTERIAL SISTOLICA \n",indicadores,parPaciente.indicadores.sPresionArterial.sistolica); 
            }
            if(parPaciente.indicadores.sPresionArterial.diastolica<56 || parPaciente.indicadores.sPresionArterial.diastolica>70){
                //Tensión Arterial Distólica
    
                sprintf(diastolica, "%d", parPaciente.indicadores.sPresionArterial.diastolica);
                printf("Alerta #%d: [56 - 70] => %d PRESION ARTERIAL DISTOLICA \n",indicadores,parPaciente.indicadores.sPresionArterial.diastolica);                   
        
            }
            strcpy(parAlerta->generoAlerta[indicadores].nombreIndicador,"Frecuencia Arterial");
            sprintf(str,"%s %s ",sistolica,diastolica);
            strcpy(parAlerta->generoAlerta[indicadores].valor, str);
            indicadores +=1;   
                    
        }
        //Frecuencia Respiratoria
        if( parPaciente.indicadores.frecuenciaRespiratoria<20 || parPaciente.indicadores.frecuenciaRespiratoria>30){
            char str[10];
            sprintf(str, "%d", parPaciente.indicadores.frecuenciaRespiratoria);
            strcpy(parAlerta->generoAlerta[indicadores].nombreIndicador,"Frecuencia Respiratoria");
            strcpy(parAlerta->generoAlerta[indicadores].valor, str);
            indicadores +=1;  
            printf("Alerta #%d: [20 - 30] => %d FRECUENCIA RESPIRATORIA \n",indicadores,parPaciente.indicadores.frecuenciaRespiratoria);                                     
        }
        //Temperatura
        if( parPaciente.indicadores.temperatura < 37.5 ||  parPaciente.indicadores.temperatura > 37.8 ){
            char str[10];
            sprintf(str, "%.2f", parPaciente.indicadores.temperatura);
            strcpy(parAlerta->generoAlerta[indicadores].nombreIndicador,"Temperatura");
            strcpy(parAlerta->generoAlerta[indicadores].valor, str);
            indicadores +=1;   
            printf("Alerta #%d: [37.5 - 37.8] => %d TEMPERATURA \n",indicadores,parPaciente.indicadores.temperatura);                     
        }
    }

    /**1 -2 años**/
    if(parPaciente.edad>1 && parPaciente.edad<2){
        printf("Edad del paciente: 1 - 2\n");
        //Frecuencia Cardiaca
        if( parPaciente.indicadores.frecuenciaCardiaca<100 || parPaciente.indicadores.frecuenciaCardiaca>120){
            char str[10];
            sprintf(str, "%d", parPaciente.indicadores.frecuenciaCardiaca);
            strcpy(parAlerta->generoAlerta[indicadores].nombreIndicador,"Frecuencia Cardiaca");
            strcpy(parAlerta->generoAlerta[indicadores].valor, str);
            indicadores +=1;
            printf("Alerta #%d: [100 - 120] => %d FRECUENCIA CARDIACA\n",indicadores,parPaciente.indicadores.frecuenciaCardiaca);
        }
       
         //Tension Arterial Sistolica
        if((parPaciente.indicadores.sPresionArterial.sistolica<98 || parPaciente.indicadores.sPresionArterial.sistolica>106) || (parPaciente.indicadores.sPresionArterial.diastolica<58 || parPaciente.indicadores.sPresionArterial.diastolica>70)){
            char sistolica[10];
            char diastolica[10];
            char str[10];
            if(parPaciente.indicadores.sPresionArterial.sistolica<98 || parPaciente.indicadores.sPresionArterial.sistolica>106){
                
                sprintf(sistolica, "%d", parPaciente.indicadores.sPresionArterial.sistolica);
               printf("Alerta #%d: [98 - 106] => %d PRESION ARTERIAL SISTOLICA \n",indicadores,parPaciente.indicadores.sPresionArterial.sistolica); 
            }
            if(parPaciente.indicadores.sPresionArterial.diastolica<58 || parPaciente.indicadores.sPresionArterial.diastolica>70){
                //Tensión Arterial Distólica
    
                sprintf(diastolica, "%d", parPaciente.indicadores.sPresionArterial.diastolica);
                printf("Alerta #%d: [58 - 70] => %d PRESION ARTERIAL DISTOLICA \n",indicadores,parPaciente.indicadores.sPresionArterial.diastolica);                   
        
            }
            strcpy(parAlerta->generoAlerta[indicadores].nombreIndicador,"Frecuencia Arterial");
            sprintf(str,"%s %s ",sistolica,diastolica);
            strcpy(parAlerta->generoAlerta[indicadores].valor, str);
            indicadores +=1;   
                    
        }

        //Frecuencia Respiratoria
        if( parPaciente.indicadores.frecuenciaRespiratoria<20 || parPaciente.indicadores.frecuenciaRespiratoria>30){
            char str[10];
            sprintf(str, "%d", parPaciente.indicadores.frecuenciaRespiratoria);
            strcpy(parAlerta->generoAlerta[indicadores].nombreIndicador,"Frecuencia Respiratoria");
            strcpy(parAlerta->generoAlerta[indicadores].valor, str);
            indicadores +=1; 
            printf("Alerta #%d: [20 - 30] => %d FRECUENCIA RESPIRATORIA \n",indicadores,parPaciente.indicadores.frecuenciaRespiratoria);                                      
        }
        //Temperatura
        if( parPaciente.indicadores.temperatura < 37.5 ||  parPaciente.indicadores.temperatura > 37.8 ){
            char str[10];
            sprintf(str, "%.2f", parPaciente.indicadores.temperatura);
            strcpy(parAlerta->generoAlerta[indicadores].nombreIndicador,"Temperatura");
            strcpy(parAlerta->generoAlerta[indicadores].valor, str);
            indicadores +=1;    
            printf("Alerta #%d: [37.5 - 37.8] => %d TEMPERATURA \n",indicadores,parPaciente.indicadores.temperatura);                    
        }
    }

    /**2 -6 años**/
    if(parPaciente.edad>2 && parPaciente.edad<6){
        printf("Edad del paciente: 2 - 6\n");
        //Frecuencia Cardiaca
        if( parPaciente.indicadores.frecuenciaCardiaca<80 || parPaciente.indicadores.frecuenciaCardiaca>120){
            char str[10];
            sprintf(str, "%d", parPaciente.indicadores.frecuenciaCardiaca);
            strcpy(parAlerta->generoAlerta[indicadores].nombreIndicador,"Frecuencia Cardiaca");
            strcpy(parAlerta->generoAlerta[indicadores].valor, str);
            indicadores +=1;
            printf("Alerta #%d: [80 - 120] => %d FRECUENCIA CARDIACA\n",indicadores,parPaciente.indicadores.frecuenciaCardiaca);
        }
       

          //Tension Arterial Sistolica
        if((parPaciente.indicadores.sPresionArterial.sistolica<99 || parPaciente.indicadores.sPresionArterial.sistolica>112) || (parPaciente.indicadores.sPresionArterial.diastolica<64 || parPaciente.indicadores.sPresionArterial.diastolica>70)){
            char sistolica[10];
            char diastolica[10];
            char str[10];
            if(parPaciente.indicadores.sPresionArterial.sistolica<99 || parPaciente.indicadores.sPresionArterial.sistolica>112){
                
                sprintf(sistolica, "%d", parPaciente.indicadores.sPresionArterial.sistolica);
               printf("Alerta #%d: [99 - 112] => %d PRESION ARTERIAL SISTOLICA \n",indicadores,parPaciente.indicadores.sPresionArterial.sistolica); 
            }
            if(parPaciente.indicadores.sPresionArterial.diastolica<64 || parPaciente.indicadores.sPresionArterial.diastolica>70){
                //Tensión Arterial Distólica
    
                sprintf(diastolica, "%d", parPaciente.indicadores.sPresionArterial.diastolica);
                printf("Alerta #%d: [64 - 70] => %d PRESION ARTERIAL DISTOLICA \n",indicadores,parPaciente.indicadores.sPresionArterial.diastolica);                   
        
            }
            strcpy(parAlerta->generoAlerta[indicadores].nombreIndicador,"Frecuencia Arterial");
            sprintf(str,"%s %s ",sistolica,diastolica);
            strcpy(parAlerta->generoAlerta[indicadores].valor, str);
            indicadores +=1;   
                    
        }

        //Frecuencia Respiratoria
        if( parPaciente.indicadores.frecuenciaRespiratoria<20 || parPaciente.indicadores.frecuenciaRespiratoria>30){
            char str[10];
            sprintf(str, "%d", parPaciente.indicadores.frecuenciaRespiratoria);
            strcpy(parAlerta->generoAlerta[indicadores].nombreIndicador,"Frecuencia Respiratoria");
            strcpy(parAlerta->generoAlerta[indicadores].valor, str);
            indicadores +=1;   
            printf("Alerta #%d: [20 - 30] => %d FRECUENCIA RESPIRATORIA \n",indicadores,parPaciente.indicadores.frecuenciaRespiratoria);                                    
        }
        //Temperatura
        if( parPaciente.indicadores.temperatura < 37.5 ||  parPaciente.indicadores.temperatura > 37.8 ){
            char str[10];
            sprintf(str, "%.2f", parPaciente.indicadores.temperatura);
            strcpy(parAlerta->generoAlerta[indicadores].nombreIndicador,"Temperatura");
            strcpy(parAlerta->generoAlerta[indicadores].valor, str);
            indicadores +=1;  
            printf("Alerta #%d: [37.5 - 37.8] => %d TEMPERATURA \n",indicadores,parPaciente.indicadores.temperatura);                      
        }
    }

    /**6 -13 años**/
    if(parPaciente.edad>6 && parPaciente.edad<13){
        printf("Edad del paciente: 6 - 13\n");
        //Frecuencia Cardiaca
        if( parPaciente.indicadores.frecuenciaCardiaca<80 || parPaciente.indicadores.frecuenciaCardiaca>100){
            char str[10];
            sprintf(str, "%d", parPaciente.indicadores.frecuenciaCardiaca);
            strcpy(parAlerta->generoAlerta[indicadores].nombreIndicador,"Frecuencia Cardiaca");
            strcpy(parAlerta->generoAlerta[indicadores].valor, str);
            indicadores +=1;
            printf("Alerta #%d: [80 - 100] => %d FRECUENCIA CARDIACA\n",indicadores,parPaciente.indicadores.frecuenciaCardiaca);
        }
       


        //Tension Arterial Sistolica
        if((parPaciente.indicadores.sPresionArterial.sistolica<104 || parPaciente.indicadores.sPresionArterial.sistolica>124) || (parPaciente.indicadores.sPresionArterial.diastolica<64 || parPaciente.indicadores.sPresionArterial.diastolica>86)){
            char sistolica[10];
            char diastolica[10];
            char str[10];
            if(parPaciente.indicadores.sPresionArterial.sistolica<104 || parPaciente.indicadores.sPresionArterial.sistolica>124){
                
                sprintf(sistolica, "%d", parPaciente.indicadores.sPresionArterial.sistolica);
               printf("Alerta #%d: [104 - 124] => %d PRESION ARTERIAL SISTOLICA \n",indicadores,parPaciente.indicadores.sPresionArterial.sistolica); 
            }
            if(parPaciente.indicadores.sPresionArterial.diastolica<64 || parPaciente.indicadores.sPresionArterial.diastolica>86){
                //Tensión Arterial Distólica
    
                sprintf(diastolica, "%d", parPaciente.indicadores.sPresionArterial.diastolica);
                printf("Alerta #%d: [64 - 86] => %d PRESION ARTERIAL DISTOLICA \n",indicadores,parPaciente.indicadores.sPresionArterial.diastolica);                   
        
            }
            strcpy(parAlerta->generoAlerta[indicadores].nombreIndicador,"Frecuencia Arterial");
            sprintf(str,"%s %s ",sistolica,diastolica);
            strcpy(parAlerta->generoAlerta[indicadores].valor, str);
            indicadores +=1;   
                    
        }


        //Frecuencia Respiratoria
        if( parPaciente.indicadores.frecuenciaRespiratoria<12 || parPaciente.indicadores.frecuenciaRespiratoria>20){
            char str[10];
            sprintf(str, "%d", parPaciente.indicadores.frecuenciaRespiratoria);
            strcpy(parAlerta->generoAlerta[indicadores].nombreIndicador,"Frecuencia Respiratoria");
            strcpy(parAlerta->generoAlerta[indicadores].valor, str);
            indicadores +=1;  
            printf("Alerta #%d: [12 - 20] => %d FRECUENCIA RESPIRATORIA \n",indicadores,parPaciente.indicadores.frecuenciaRespiratoria);                                     
        }
        //Temperatura
        if( parPaciente.indicadores.temperatura < 37 ||  parPaciente.indicadores.temperatura > 37.5 ){
            char str[10];
            sprintf(str, "%.2f", parPaciente.indicadores.temperatura);
            strcpy(parAlerta->generoAlerta[indicadores].nombreIndicador,"Temperatura");
            strcpy(parAlerta->generoAlerta[indicadores].valor, str);
            indicadores +=1; 
            printf("Alerta #%d: [37 - 37.5] => %d TEMPERATURA \n",indicadores,parPaciente.indicadores.temperatura);                       
        }
    }
    
    /**13 -16 años**/
    if(parPaciente.edad>13 && parPaciente.edad<16){
        printf("Edad del paciente: 13 - 16\n");
        //Frecuencia Cardiaca
        if( parPaciente.indicadores.frecuenciaCardiaca<70 || parPaciente.indicadores.frecuenciaCardiaca>80){
            char str[10];
            sprintf(str, "%d", parPaciente.indicadores.frecuenciaCardiaca);
            strcpy(parAlerta->generoAlerta[indicadores].nombreIndicador,"Frecuencia Cardiaca");
            strcpy(parAlerta->generoAlerta[indicadores].valor, str);
            indicadores +=1;
            printf("Alerta #%d: [70 - 80] => %d FRECUENCIA CARDIACA\n",indicadores,parPaciente.indicadores.frecuenciaCardiaca);
        }
        
        //Tension Arterial Sistolica
        if((parPaciente.indicadores.sPresionArterial.sistolica<118 || parPaciente.indicadores.sPresionArterial.sistolica>132) || (parPaciente.indicadores.sPresionArterial.diastolica<70 || parPaciente.indicadores.sPresionArterial.diastolica>82)){
            char sistolica[10];
            char diastolica[10];
            char str[10];
            if(parPaciente.indicadores.sPresionArterial.sistolica<118 || parPaciente.indicadores.sPresionArterial.sistolica>132){
                
                sprintf(sistolica, "%d", parPaciente.indicadores.sPresionArterial.sistolica);
               printf("Alerta #%d: [118 - 132] => %d PRESION ARTERIAL SISTOLICA \n",indicadores,parPaciente.indicadores.sPresionArterial.sistolica); 
            }
            if(parPaciente.indicadores.sPresionArterial.diastolica<70 || parPaciente.indicadores.sPresionArterial.diastolica>82){
                //Tensión Arterial Distólica
    
                sprintf(diastolica, "%d", parPaciente.indicadores.sPresionArterial.diastolica);
                printf("Alerta #%d: [70 - 82] => %d PRESION ARTERIAL DISTOLICA \n",indicadores,parPaciente.indicadores.sPresionArterial.diastolica);                   
        
            }
            strcpy(parAlerta->generoAlerta[indicadores].nombreIndicador,"Frecuencia Arterial");
            sprintf(str,"%s %s ",sistolica,diastolica);
            strcpy(parAlerta->generoAlerta[indicadores].valor, str);
            indicadores +=1;   
                    
        }


        //Frecuencia Respiratoria
        if( parPaciente.indicadores.frecuenciaRespiratoria<12 || parPaciente.indicadores.frecuenciaRespiratoria>20){
            char str[10];
            sprintf(str, "%d", parPaciente.indicadores.frecuenciaRespiratoria);
            strcpy(parAlerta->generoAlerta[indicadores].nombreIndicador,"Frecuencia Respiratoria");
            strcpy(parAlerta->generoAlerta[indicadores].valor, str);
            indicadores +=1;   
            printf("Alerta #%d: [12 - 20] => %d FRECUENCIA RESPIRATORIA \n",indicadores,parPaciente.indicadores.frecuenciaRespiratoria);                           
        }
        //Temperatura
        if( parPaciente.indicadores.temperatura != 37){
            char str[10];
            sprintf(str, "%.2f", parPaciente.indicadores.temperatura);
            strcpy(parAlerta->generoAlerta[indicadores].nombreIndicador,"Temperatura");
            strcpy(parAlerta->generoAlerta[indicadores].valor, str);
            indicadores +=1;  
            printf("Alerta #%d: [37] => %d TEMPERATURA \n",indicadores,parPaciente.indicadores.temperatura);                                     
        }
    }

    /**16 años y más**/
    if(parPaciente.edad>16){
        printf("Edad del paciente: Mas de 16\n");
        //Frecuencia Cardiaca
        if( parPaciente.indicadores.frecuenciaCardiaca<60 || parPaciente.indicadores.frecuenciaCardiaca>80){
            char str[10];
            sprintf(str, "%d", parPaciente.indicadores.frecuenciaCardiaca);
            strcpy(parAlerta->generoAlerta[indicadores].nombreIndicador,"Frecuencia Cardiaca");
            strcpy(parAlerta->generoAlerta[indicadores].valor, str);
            indicadores +=1;
            printf("Alerta #%d: [60 - 80] => %d FRECUENCIA CARDIACA\n",indicadores,parPaciente.indicadores.frecuenciaCardiaca);
        }
        //Tension Arterial Sistolica
        if((parPaciente.indicadores.sPresionArterial.sistolica<110 || parPaciente.indicadores.sPresionArterial.sistolica>140) || (parPaciente.indicadores.sPresionArterial.diastolica<70 || parPaciente.indicadores.sPresionArterial.diastolica>90)){
            char sistolica[10]=" ";
            char diastolica[10]=" ";
            char str[10];
            if(parPaciente.indicadores.sPresionArterial.sistolica<110 || parPaciente.indicadores.sPresionArterial.sistolica>140){
                
                sprintf(sistolica, "%d", parPaciente.indicadores.sPresionArterial.sistolica);
               printf("Alerta #%d: [110 - 140] => %d PRESION ARTERIAL SISTOLICA \n",indicadores,parPaciente.indicadores.sPresionArterial.sistolica); 
            }
            else if(parPaciente.indicadores.sPresionArterial.diastolica<70 || parPaciente.indicadores.sPresionArterial.diastolica>90){
                //Tensión Arterial Distólica
    
                sprintf(diastolica, "%d", parPaciente.indicadores.sPresionArterial.diastolica);
                printf("Alerta #%d: [70 - 90] => %d PRESION ARTERIAL DISTOLICA \n",indicadores,parPaciente.indicadores.sPresionArterial.diastolica);                   
        
            }
            strcpy(parAlerta->generoAlerta[indicadores].nombreIndicador,"Frecuencia Arterial");
            sprintf(str,"%s %s ",sistolica,diastolica);
            strcpy(parAlerta->generoAlerta[indicadores].valor, str);
            indicadores +=1;   

            
//            __fpurge(stdin);
                    
        }
        
        //Frecuencia Respiratoria
        if( parPaciente.indicadores.frecuenciaRespiratoria<12 || parPaciente.indicadores.frecuenciaRespiratoria>20){
            char str[10];
            sprintf(str, "%d", parPaciente.indicadores.frecuenciaRespiratoria);
            strcpy(parAlerta->generoAlerta[indicadores].nombreIndicador,"Frecuencia Respiratoria");
            strcpy(parAlerta->generoAlerta[indicadores].valor, str);
            indicadores +=1;   
            printf("Alerta #%d: [12 - 20] => %d FRECUENCIA RESPIRATORIA \n",indicadores,parPaciente.indicadores.frecuenciaRespiratoria);                  
        }
        //Temperatura
        if( parPaciente.indicadores.temperatura < 36.2 ||  parPaciente.indicadores.temperatura > 37.2 ){
            char str[10];
            sprintf(str, "%.2f", parPaciente.indicadores.temperatura);
            
            strcpy(parAlerta->generoAlerta[indicadores].nombreIndicador,"Temperatura");
            strcpy(parAlerta->generoAlerta[indicadores].valor, str);
            indicadores +=1;   
            printf("Alerta #%d: [36.2 - 37.2] => %s TEMPERATURA \n",indicadores,str);                           
        }

        
    }
    
    //Saturacion de Oxigeno (Para todas las edades)
    if(parPaciente.indicadores.saturacionOxigeno<90 || parPaciente.indicadores.saturacionOxigeno>100 ){
        
        
        char str[10];
        //Convierte de int a char, ahora str contiene el char
        sprintf(str, "%d", parPaciente.indicadores.saturacionOxigeno);
        
        //Aqui debo apuntar a la estructura que guarda los datos que fueron mayores a lo normals
        strcpy(parAlerta->generoAlerta[indicadores].nombreIndicador,"Saturacion Oxigeno");
        strcpy(parAlerta->generoAlerta[indicadores].valor, str);
        
        indicadores +=1;
        printf("Alerta #%d: [90 - 100] => %d SATURACION DE OXIGENO\n",indicadores,parPaciente.indicadores.saturacionOxigeno);

    }


    return indicadores;
}

