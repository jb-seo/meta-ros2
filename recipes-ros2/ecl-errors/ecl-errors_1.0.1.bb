# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This library provides lean and mean error mechanisms.     It includes c style error functions as well as a few     useful macros. For higher level mechanisms,     refer to ecl_exceptions."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "ament-cmake-ros ecl-build ecl-config ecl-license"
SRC_URI = "https://github.com/yujinrobot-release/ecl_lite-release/archive/release/crystal/ecl_errors/1.0.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "81a41e6eb9cedfc34ab01d07247fcb12"
SRC_URI[sha256sum] = "7253c6f1af5c15d658d23f14b52f07fa1bc48648b8dfa34eed0c95ba8875b186"
S = "${WORKDIR}/ecl_lite-release-release-crystal-ecl_errors-1.0.1-0"

inherit catkin
