# @Scheduled(cron = "0 0 20 * * *")
Esta expressão cron especifica que o método deve ser executado às 20:00 todos os dias, independentemente da data. Aqui está uma explicação da expressão cron:

Os primeiros dois campos especificam o segundo e o minuto em que o método deve ser executado. 0 0 significa que o método será executado no início do minuto (segundo 0).
O terceiro campo especifica a hora em que o método deve ser executado. 20 significa que o método será executado às 20:00 (horário de 24 horas).
Os campos restantes (* * *) especificam que o método deve ser executado em todos os dias do mês, todos os meses e todos os dias da semana.
Lembre-se de ajustar o fuso horário do servidor para garantir que a execução ocorra no horário desejado, caso contrário, ela pode ser executada em um horário diferente do esperado.


No Gmail precisa ir em segurança > autenticação por dois fatores e criar uma senha de aplicativo.
  


