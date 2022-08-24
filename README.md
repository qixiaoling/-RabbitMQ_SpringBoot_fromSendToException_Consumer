Master branch has the normal procedure of consuming a message from RabbitMQ;
Exception branch handles wrong message e.g. minus salary which the message will try max 6 times and then go into a deadletterque and result finally in exception.

//Here in this project we needed a customized service to consumer the message -> therefore we need to customized the
//MessageListenerContainer which also including other stuff like a customized connectionFactory.

 //Unlike the Classified consumer project, we didn't need to do anything to the message, therefore we didn't need a MessageListener;
 //What we did is simplely using Camel to grab the end point and does other service, therefore we didn't need to configure
 //or customize a MessageListenerContainer.
