# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package provides simple support to cmath, filling in holes     or redefining in a c++ formulation where desirable."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "ecl-build ecl-license ecl-type-traits"
SRC_URI = "https://github.com/yujinrobot-release/ecl_core-release/archive/release/bouncy/ecl_math/1.0.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "f6d778099efc8c747434d0ac989c57e1"
SRC_URI[sha256sum] = "9191703167fa5243383baff69d0b95c780aaafac51577b425e0ef026706da725"
S = "${WORKDIR}/ecl_core-release-release-bouncy-ecl_math-1.0.0-0"

inherit ros
inherit ament


