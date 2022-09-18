# InventoryControlSystems
### Download Apache ZooKeeper 3.2.2, unzip it and start it using following command
./bin/zkServer.sh start conf/zoo_sample.cfg

### Build and Run client , distributed lock and server seperately.
##### distributed lock - mvn clean install
##### client - mvn clean install , java -jar target/....SNAPSHOT-jar-with-dependencies.jar localhost [port]
##### server - mvn clean install, java -jar target/....SNAPSHOT-jar-with-dependencies.jar [port]

