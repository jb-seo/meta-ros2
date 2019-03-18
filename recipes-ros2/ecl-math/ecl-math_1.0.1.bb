# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package provides simple support to cmath, filling in holes     or redefining in a c++ formulation where desirable."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = " ecl-build ecl-license ecl-type-traits"
SRC_URI = "https://github.com/yujinrobot-release/ecl_core-release/archive/release/crystal/ecl_math/1.0.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "bb982206a3263a8fccb882bbfc52097f"
SRC_URI[sha256sum] = "34a913f20b96c7a81741ede0f5af6b280089f100b273304efc328a9a2d738ae4"
S = "${WORKDIR}/ecl_core-release-release-crystal-ecl_math-1.0.1-0"

inherit ament
