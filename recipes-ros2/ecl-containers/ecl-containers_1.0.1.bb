# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The containers included here are intended to extend the stl containers.     In all cases, these implementations are designed to implement     c++ conveniences and safety where speed is not sacrificed.      Also includes techniques for memory debugging of common problems such     as buffer overruns."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "ament-cmake-ros ecl-build ecl-config ecl-converters ecl-errors ecl-exceptions ecl-formatters ecl-license ecl-mpl ecl-type-traits ecl-utilities"
SRC_URI = "https://github.com/yujinrobot-release/ecl_core-release/archive/release/crystal/ecl_containers/1.0.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "3b45a92353bda2efb122f42ed5fac437"
SRC_URI[sha256sum] = "a98dc17847066bd224c940ceec83f19382445a49a50436b6f2d2dbe41cfa9a44"
S = "${WORKDIR}/ecl_core-release-release-crystal-ecl_containers-1.0.1-0"

inherit catkin
