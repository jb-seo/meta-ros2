# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Libraries and utilities for embedded and low-level linux development."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "ament-cmake-ros ecl-config ecl-converters-lite ecl-errors ecl-io ecl-sigslots-lite ecl-time-lite"
SRC_URI = "https://github.com/yujinrobot-release/ecl_lite-release/archive/release/crystal/ecl_lite/1.0.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "b89c400166a6291b2dbe28661d27a794"
SRC_URI[sha256sum] = "da24938f4d3fabe34a7d9e936cb274beb26f8070113c92fd3b3da54b7a127f75"
S = "${WORKDIR}/ecl_lite-release-release-crystal-ecl_lite-1.0.1-0"

inherit catkin
