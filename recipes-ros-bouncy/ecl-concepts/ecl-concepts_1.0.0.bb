# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Introduces a compile time concept checking mechanism that can be used      most commonly to check for required functionality when passing      template arguments."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "ecl-build ecl-config ecl-license ecl-type-traits"
SRC_URI = "https://github.com/yujinrobot-release/ecl_core-release/archive/release/bouncy/ecl_concepts/1.0.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "8e6fa33f3c8a3f55fdf19985c9925962"
SRC_URI[sha256sum] = "c3f4be0046364d9657cc93ad069aac82091801458786412945b0de5c4e9ed906"
S = "${WORKDIR}/ecl_core-release-release-bouncy-ecl_concepts-1.0.0-0"


inherit ros
inherit ament

