# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Most implementations (windows, posix, ...) have slightly different api for      low level input-output functions. These are gathered here and re-represented      with a cross platform set of functions."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "ament-cmake-ros ecl-build ecl-config ecl-errors ecl-license"
SRC_URI = "https://github.com/yujinrobot-release/ecl_lite-release/archive/release/crystal/ecl_io/1.0.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "565a3e44b2564688316e54a6e91be1fb"
SRC_URI[sha256sum] = "415a4a10ce017151d21132c31d26f1dcac1cb80cae3fe6f5b5eb79241acd06e6"
S = "${WORKDIR}/ecl_lite-release-release-crystal-ecl_io-1.0.1-0"

inherit catkin
