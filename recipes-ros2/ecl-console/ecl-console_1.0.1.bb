# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Color codes for ansii consoles."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "ament-cmake-ros ecl-build ecl-config ecl-license"
SRC_URI = "https://github.com/yujinrobot-release/ecl_lite-release/archive/release/crystal/ecl_console/1.0.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "495c8ce31dc8fa74ab70da46f74c8d33"
SRC_URI[sha256sum] = "4c6c0d24df184f7b818373d6db1e430079772dfbf33741e96bdd589259708435"
S = "${WORKDIR}/ecl_lite-release-release-crystal-ecl_console-1.0.1-0"

inherit catkin
