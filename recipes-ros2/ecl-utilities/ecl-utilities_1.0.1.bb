# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Includes various supporting tools and utilities for c++ programming."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "ament-cmake-ros ecl-build ecl-concepts ecl-license ecl-mpl"
SRC_URI = "https://github.com/yujinrobot-release/ecl_core-release/archive/release/crystal/ecl_utilities/1.0.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "d4b3a0690098f19707b561ebd543b619"
SRC_URI[sha256sum] = "393f6746ee0a4963fff724ea6f63c429e76f2beb5ef25e37e552134afe570b94"
S = "${WORKDIR}/ecl_core-release-release-crystal-ecl_utilities-1.0.1-0"

inherit catkin
