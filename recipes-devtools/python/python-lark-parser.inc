DESCRIPTION = "Lark - a modern parsing library for Python"
SECTION = "devel/python"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=4a68416544bf138dbcf4dab6e9423231"
SRCNAME = "lark"

SRC_URI = "https://github.com/lark-parser/lark/archive/0.6.7.tar.gz;downloadfilename=${BPN}_${PV}.tar.gz"
SRC_URI[md5sum] = "43a7b51228438622348a8a0a955e9c81"
SRC_URI[sha256sum] = "5d104596a353916a5c3f1ba3c5711d44b555c6c5cfee8ebaef5cb11e6f72450e"

S = "${WORKDIR}/${SRCNAME}-${PV}"

BBCLASSEXTEND = "native"
