# BancoFifo
#Nombre y descripción del proyecto
-Sistema de Bnaco Fifo
-Este proyecto consiste en un sistema de atención para una ventanilla bancaria permite registrar clientes en una cola FIFO, atenderlos en orden de llegada y realizar operaciones como ver la fila, consultar clientes en espera y vaciar la cola mediante un menú interactivo en consola.

#Instrucciones de compilación y ejecución.
- Agregar clientes
- Atender clientes
- Ver siguiente cliente
- Mostrar cola
- Consultar cantidad
- Vaciar cola
#Capturas de pantalla de la ejecución del menú.
<img width="541" height="218" alt="image" src="https://github.com/user-attachments/assets/511d7553-c031-425a-973e-e0a83e819d96" />
<img width="309" height="212" alt="image" src="https://github.com/user-attachments/assets/06ddd97b-1fbe-422d-a8d1-0f6f3c1c83bb" />
<img width="695" height="181" alt="image" src="https://github.com/user-attachments/assets/6c320517-7444-4e7c-8af1-24162bdd9aef" />
<img width="712" height="191" alt="image" src="https://github.com/user-attachments/assets/91903a87-1591-43ce-9074-637b0bb37909" />
#Explicación breve de cómo se implementó la FIFO
La implementación FIFO se realizó usando Queue y LinkedList en Java. Los clientes se agregan a la cola con offer y se atienden en orden de llegada usando poll También se utilizó peek para ver el siguiente cliente sin eliminarlo de la cola.
#Enlace a un diagrama de clases (UML) simple (puede ser en texto o imagen).
Diagrama UML 

    Cliente      
---------------------
 - nombre         
 - identificacion 
 - transaccion    
 - horaLlegada    
---------------------
+ Cliente()      
+ toString()     
---------------------

----------------------
     Main       
-----------------------
 - Queue<Cliente> 
-----------------------
+ main()         
------------------------

