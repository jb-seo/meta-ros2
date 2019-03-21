# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Package containing various utility types and functions for C"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "python3-empy-native"
SRC_URI = "https://github.com/ros2-gbp/${PN}-release/archive/release/bouncy/${PN}/0.5.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "cbc3a445e60fcb58da9e031523167a52"
SRC_URI[sha256sum] = "8be72d066b22b092a0daacd0c264f9053b16fb87ff9f04422168c88e90e3731d"
S = "${WORKDIR}/${PN}-release-release-bouncy-${PN}-0.5.1-0"

inherit ros
inherit ament


