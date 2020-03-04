ARG CLOJURE_VERSION=tools-deps-1.10.1.502-slim-buster

FROM clojure:${CLOJURE_VERSION}

LABEL maintainer="Lucca Pessoa da Silva Matos - luccapsm@gmail.com" \
      org.label-schema.url="https://github.com/lpmatos" \
      org.label-schema.name="Clojure Intro"

ENV HOME=/usr/src/code

WORKDIR ${HOME}

COPY [ "./code", "." ]

ENTRYPOINT []

CMD [ "bash" ]
