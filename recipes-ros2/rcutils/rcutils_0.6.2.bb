# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Package containing various utility types and functions for C"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "ament-cmake-ros python3-empy"
SRC_URI = "https://github.com/ros2-gbp/${PN}-release/archive/release/crystal/${PN}/0.6.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "804f9098abb8cae996e1005675297b57"
SRC_URI[sha256sum] = "0fdb96bde3e98cd975529a326ffaf7ff763f51d523d5fc98fab8c6af6980b407"
S = "${WORKDIR}/${PN}-release-release-crystal-${PN}-0.6.2-0"

inherit catkin
