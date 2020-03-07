ARG CLOJURE_VERSION=tools-deps-1.10.1.502-slim-buster

# =============================================================================
# FINAL STAGE
# =============================================================================

FROM clojure:${CLOJURE_VERSION}

LABEL maintainer="Lucca Pessoa da Silva Matos - luccapsm@gmail.com" \
      org.label-schema.system="https://www.debian.org/index.pt.html" \
      org.label-schema.language="https://clojurescript.org/guides/quick-start" \
      org.label-schema.url="https://github.com/lpmatos" \
      org.label-schema.name="Clojure Intro"

ENV HOME=/usr/src/code \
    LANG=C.UTF-8 \
    LC_ALL=C.UTF-8 \
    TZ=America/Sao_Paulo

WORKDIR ${HOME}

USER root

COPY --chown=root:root [ "./code", "." ]

ENTRYPOINT []

CMD [ "bash" ]
