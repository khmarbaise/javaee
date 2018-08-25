#!/bin/bash
# mvn site site:stage
docker run -p 8080:80 --name some-nginx -v `pwd`/target/staging:/usr/share/nginx/html:ro -d nginx:1.14.0-alpine
