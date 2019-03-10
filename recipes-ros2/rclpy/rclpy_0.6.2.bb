# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Package containing the Python client."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "ament-cmake ament-index-python builtin-interfaces python-cmake-module rcl rcl-yaml-param-parser rcutils rmw-implementation rmw-implementation-cmake"
SRC_URI = "https://github.com/ros2-gbp/${PN}-release/archive/release/crystal/${PN}/0.6.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "418e49a4e91f99752638d85b56c8afaa"
SRC_URI[sha256sum] = "f26f630bbe392ca84f2019f3b3fe459121def136c6ee461daf828620679d2408"
S = "${WORKDIR}/${PN}-release-release-crystal-${PN}-0.6.2-0"

inherit catkin
