The pattern intends to encapsulate in an object all the data required for performing a given action (command), including what method to call, the method’s arguments, and the object to which the method belongs.

This model allows us to decouple objects that produce the commands from their consumers, so that’s why the pattern is commonly known as the producer-consumer pattern.

In a classic implementation, the command pattern requires implementing four components: the Command, the Receiver, the Invoker, and the Client.

# COMMAND - A command is an object whose role is to store all the information required for executing an action, including the method to call, the method arguments, and the object (known as the receiver) that implements the method.

# RECEIVER - A receiver is an object that performs a set of cohesive actions. It’s the component that performs the actual action when the command’s execute() method is called.

# INVOKER - An invoker is an object that knows how to execute a given command but doesn’t know how the command has been implemented. It only knows the command’s interface.
                    thin layer of abstraction that decouples the command objects from

# CLIENT - A client is an object that controls the command execution process by specifying what commands to execute and at what stages of the process to execute them.


