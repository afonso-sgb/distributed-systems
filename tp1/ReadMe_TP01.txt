1. Manager
podman build -t grpc-manager-trab -f Dockerfile_manager . 
podman run -d --name grpc-manager-trab --network host grpc-manager-trab 0.0.0.0 50051
   							#<GENERALIP><Manager_PORT>
podman exec -it grpc-manager-trab ip addr 
   #Utilizar para o restante dos comandos o IP listado em: etha0 -> inet

2.TM
podman build -t grpc-tm-trab -f Dockerfile_TM . 
podman run -d --name grpc-tm-trab --network host grpc-tm-trab 172.20.101.64 50052
 							#<HostMachineIP><TM_PORT> 

3. Servector
podman build -t grpc-servector-trab -f Dockerfile_servector . 
  #Só precisa correr uma vez 

podman run -d --name grpc-servector-trab --network host grpc-servector-trab 172.20.101.64 50053 172.20.101.64 50051 172.20.101.64 50052

	#Importante, se corrermos mais de um container, alterar porta e nome do container. pex: 
podman run -d --name grpc-servector2-trab --network host grpc-servector2-trab 172.20.101.64 90000
	#<ServiceVectorIP> <ServiceVectorPort> <managerIP> <managerPort> <TMIP> <TMPort>

3. Client
java -jar Client-1.0-jar-with-dependencies.jar 172.20.101.64 50051 172.20.101.64 50052
<HostMachineIP><ManagerPort_PORT> <HostMachineIP><TM_PORT> 
