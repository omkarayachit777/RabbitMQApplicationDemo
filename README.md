Reference link - https://rameshfadatare.medium.com/spring-boot-microservices-with-rabbitmq-example-92a38cbe08fc
				 https://www.geeksforgeeks.org/advance-java/microservices-communication-with-rabbitmq/ (for spring boot 4 not worked)
				 chatGPT
				 
Postman collection added here - RabbitMQ.postman_collection.json

RabbitMQ - URL - http://localhost:15672/
				username - guest
				password - guest

--------------------------------------------------------------------------------------------------------------------------------
================ How application is working ================
--------------------------------------------------------------------------------------------------------------------------------

ProducerApplication - responible for produce messages

Messages will be in queue -> queue name we given in config file --> we can visualize the same in http://localhost:15672/#/

Till the time consumer consumes (i.e. reads the message it will be in queue)

ConsumerApplication - responsible to read the messages sent by producer

Once message is consumed by consumer It will be removed from queue --> we can visualize it http://localhost:15672/#/
--------------------------------------------------------------------------------------------------------------------------------
