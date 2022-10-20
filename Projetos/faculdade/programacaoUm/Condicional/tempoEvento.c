#include <stdio.h>
void main() {

    int hora_inicial, minuto_inicial, tempo_inicio, tempo_fim, hora_final, minuto_final,
    dias_decorridos, tempo_decorrido, i, hora_para_outro_dia, 
    horas_passadas, minutos_passados;

    printf("Insira o horario inicial do evento (hora/minuto): \n");
    scanf("%d%d", &hora_inicial, &minuto_inicial);
    printf("Insira o horario final do evento (hora/minuto): \n");
    scanf("%d%d", &hora_final, &minuto_final);

    tempo_inicio = minuto_inicial + (hora_inicial * 60);
    tempo_fim = minuto_final + (hora_final * 60);

    if(tempo_inicio >= tempo_fim) {

        hora_para_outro_dia = 0;
        for(i = hora_inicial; i < 24; i++) {
            hora_para_outro_dia++;
        }

        tempo_decorrido = (hora_para_outro_dia * 60) + (tempo_fim - minuto_inicial); 
    } else {
        tempo_decorrido = tempo_fim - tempo_inicio;
    }

    horas_passadas = tempo_decorrido/60;
    minutos_passados = tempo_decorrido%60;

    printf("%d : %d", horas_passadas, minutos_passados);

}