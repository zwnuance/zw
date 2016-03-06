#!/usr/bin/env bash
#@Author zw
#@Description install hue(a management tool for hadoop, hbase,etc.)
#@From https://github.com/cloudera/hue

sudo apt-get install -y gcc \
g++ \
libkrb5-dev \
libmysqlclient-dev \
libssl-dev \
libsasl2-dev \
libsasl2-modules-gssapi-mit \
libsqlite3-dev \
libtidy-0.99-0 \
libxml2-dev \
libxslt1-dev \
make \
libldap2-dev \
python-dev \
python-setuptools \
libgmp3-dev \
zlib1g-dev

cd  /usr/local/
git clone https://github.com/cloudera/hue.git
cd hue
make apps

# $HBase_home/bin/hbase thrift start
build/env/bin/hue runserver

