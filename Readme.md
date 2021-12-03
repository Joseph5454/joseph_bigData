Lien vers l'image sur docker hub : https://hub.docker.com/repository/docker/josi92i/joseph_bigdata

docker build -t josi92i/joseph_bigdata .

docker run -p 27017:27017 mongo --name mongodb

docker run -p 8080:8080 --link mongodb:mongodb josi92i/joseph_bigdata