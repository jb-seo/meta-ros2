# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Tools and utilities for ecl development."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = " ecl-build ecl-license"
SRC_URI = "https://github.com/yujinrobot-release/ecl_tools-release/archive/release/crystal/ecl_tools/1.0.1-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "c729f6c32f944e40c9658aab1d5751e5"
SRC_URI[sha256sum] = "899c4f6f93e12acdb6d81631ac8fdf56c45a54f565e68a4ce6a05030e4ddbbbd"
S = "${WORKDIR}/ecl_tools-release-release-crystal-ecl_tools-1.0.1-1"

inherit ament
