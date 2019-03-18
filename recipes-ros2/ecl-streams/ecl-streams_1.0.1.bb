# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "These are lightweight text streaming classes that connect to standardised      ecl type devices."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = " ecl-build ecl-concepts ecl-converters ecl-devices ecl-errors ecl-license ecl-time ecl-type-traits"
SRC_URI = "https://github.com/yujinrobot-release/ecl_core-release/archive/release/crystal/ecl_streams/1.0.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "0f27d9a7834e28b722b2997f12dd0b93"
SRC_URI[sha256sum] = "06275da6301894c7d669770ca6333a60b9b0ccd0ffeee6482464fd8c1924a34e"
S = "${WORKDIR}/ecl_core-release-release-crystal-ecl_streams-1.0.1-0"

inherit ament
