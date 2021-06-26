package design.command;

/*
It is behavioral design pattern from Gang of four. It is used to encapsulate a request as an object and pass it to invoker.
The invoker doesn't know how to service the request from the client and it will take the command and pass it to receiver who knows how to perform the command .

Example: Person(client) -> remoteControl(invoker) -->remote function(command) ->  onCommand, offCommand (Concrete Command)-> Television(receiver)

command(interface)-> OnCommand(concrete implementation)
command(interface)-> OffCommand(concrete implementation)

Here Television(receiver) is completely decoupled from Person(client) as well as invoker(remoteControl). Hence television  can change implementation without impacting both
 */
public class Person {
    public static void main(String[] args) {
        Television television = new Television();
        RemoteControl remoteControl = new RemoteControl();
        //Switch On
        OnCommand onCommand = new OnCommand(television);
        remoteControl.setCommand(onCommand);
        remoteControl.pressButton();

        //Switch Off
        OffCommand offCommand = new OffCommand(television);
        remoteControl.setCommand(offCommand);
        remoteControl.pressButton();
    }
}
