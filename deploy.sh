#!/usr/bin/env bash

echo "Building the project.."
./gradlew clean build

echo "Building the docker image.."
docker image build -t employee:1.0 .

echo "Pointing kubernetes to local docker registry.."
eval $(minikube docker-env)

echo "Deleting kubernetes resources.."
#kubectl delete service employee
#kubectl delete deployment employee

echo "Deploying the application.."
kubectl apply -f deployment.yaml
kubectl apply -f service.yaml