# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "These tools inspect and describe your system with macros, types      and functions."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "ament-cmake-ros ecl-build ecl-license"
SRC_URI = "https://github.com/yujinrobot-release/ecl_lite-release/archive/release/crystal/ecl_config/1.0.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "3faf94eda073e899fa668ccea794c74f"
SRC_URI[sha256sum] = "8ad595aa9aed466ab1b8e62aa7da54d3694dfe6308695b27d18892807b940de6"
S = "${WORKDIR}/ecl_lite-release-release-crystal-ecl_config-1.0.1-0"

inherit catkin
