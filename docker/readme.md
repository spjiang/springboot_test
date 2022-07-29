
docker network create -d bridge prometheus-net

###prometheus
1、docker run -d -p 9090:9090 --network prometheus-net --name prometheus -v $(pwd)/prometheus.yml:/etc/prometheus/prometheus.yml prom/prometheus --config.file=/etc/prometheus/prometheus.yml

2、访问 http://localhost:9090

###grafana
1、docker run -d --name=grafana --network prometheus-net -p 3000:3000 grafana/grafana 

2、访问 http://localhost:3000