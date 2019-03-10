# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Template based exceptions - these are simple and practical      and avoid the proliferation of exception types. Although not      syntatactically ideal, it is convenient and eminently practical."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "ament-cmake-ros ecl-build ecl-config ecl-errors ecl-license"
SRC_URI = "https://github.com/yujinrobot-release/ecl_core-release/archive/release/crystal/ecl_exceptions/1.0.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "53bb50f31cf904361560af94771d321c"
SRC_URI[sha256sum] = "c673d88f292daa245bfa460d0af1e3623e15f8c507adec03b28f9fc5ca82968b"
S = "${WORKDIR}/ecl_core-release-release-crystal-ecl_exceptions-1.0.1-0"

inherit catkin
