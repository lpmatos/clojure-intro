Clojure Programming Language
============

Just a repository to build some **Clojure** Scripts and Study this language.

[![Open Source](https://badges.frapsoft.com/os/v1/open-source.svg?v=102)](https://github.com/lpmatos)

## Copyright (c)

Lucca Pessoa da Silva Matos (c) 2019 - **GitHub Repository**

## Getting Started

To use this repository you need to make a **git clone**:

```bash
git clone --depth 1 https://github.com/lpmatos/clojure-intro.git -b master
```

This will give access on your **local machine** to this project.

## Organization

* **/code** in this folder we have the all **Clojure** scripts.
* **/docs** is the directory where we have all documentation files.
* **CHANGELOG.md** is a versioning file usend to control development versions.
* **docker-compose.yml** is the **Docker** container orchestrator.
* **Dockerfile** is a file used to set up your **Docker** environment.
* **Makefile** is a file containing a set of automation policies.
* **README.md** is an optional file. A human-readable **README** file.
* **.gitlab-ci.yml** is the file that uses the templates find in **pipeline** folder.
* The files found in the project root are support files to the **CI/CD** process and others contexts.

## Description 

<->
Put Some information in Here
<->

## Clojure

<->
Put Some information in Here
<->

## Pre-Requisites

**Tools**
:---:
**Clojure**
**Debian**
**Docker**
**docker-compose**

## Containers

<->
Put Some information in Here
<->

## Structure

<->
Put Some information in Here
<->

## Environment Variables

<->
Put Some information in Here
<->

## Docker

### Building

Additional steps for the developer to build the project after some code changes.

To **Build** the image:

```bash
docker image build -t <IMAGE_NAME> -f <PATH_DOCKERFILE> <PATH_CONTEXT_DOCKERFILE>
```

or

```bash
docker image build -t <IMAGE_NAME> . (This context)
```

Explain:

* **IMAGE_NAME**:
    * Image **Name/Tag**.
* **PATH_DOCKERFILE**:
    * **Dockerfile** location.
    * Where is the full path to **Dockerfile** located?
* **PATH_CONTEXT_DOCKERFILE**:
    * **Dockerfile** context.
    * Where is the **Dockerfile**?

#### Run the Container with the image

* Running the **Container** in **Detached mode**/**Background**:

```bash
docker container run -d -p <LOCAL_PORT:CONTAINER_PORT> <IMAGE_NAME>
```

* Running the **Container** in **Interactive mode**:

```bash
docker container run -it --rm --name <CONTAINER_NAME> -p <LOCAL_PORT:CONTAINER_PORT> <IMAGE_NAME>
```

* Running with **docker-compose** in **Interactive mode**:

```bash
docker-compose run --rm clojure
```

### Basic Commands

* Windows

```bash
winpty docker.exe run -it --rm <IMAGE_NAME> <COMMAND>
```

* Showing all local images:

```bash
docker images
```

or

```bash
docker image ls
```

* Showing all Active or Inactive **Containers**:

```bash
docker ps -a
```

* Showing all Active **Containers**:

```bash
docker ps
```

* Entering an Active **Container**:

```bash
docker exec -it <CONTAINER_ID> <COMMAND>
```

## Usage

<kbd>clj ./main.clj</kbd> - Clojure Interpreter

## Params

```bash
Put some information here
```

## Built with

- [Clojure](https://clojure.org/)
- [Debian](https://www.debian.org/index.pt.html)
- [Docker](https://docs.docker.com/)
- [Docker Compose](https://docs.docker.com/compose/)

## How to contribute

1. Make a **Fork**.

2. Follow the project organization.

3. Add the file to the appropriate level folder - If the folder does not exist, create according to the standard.

4. Make the **Commit**.

5. Open a **Pull Request**.

6. Wait for your pull request to be accepted.. 🚀

Remember: There is no bad code, there are different views/versions of solving the same problem. 😊

## Add to git and push

You must send the project to your GitHub after the modifications

```bash
git add -f .
git commit -m "Added - Fixing somethings"
git push origin master
```

## Contacts

Hey!! If you like this project or if you find some bugs feel free to contact me in my channels:

---

* **Email**: luccapsm@gmail.com
* **Linkedin**: www.linkedin.com/in/lucca-pessoa-4abb71138/

---

[![Facebook](https://github.frapsoft.com/social/facebook.png)](https://www.facebook.com/lucca.pessoa.9)
[![Github](https://github.frapsoft.com/social/github.png)](https://github.com/lpmatos)

## Versioning

- [CHANGELOG](CHANGELOG.md)

## Project Status

* In production
