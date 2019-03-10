# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "CDR serialization implementation."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "cmake"
SRC_URI = "https://github.com/ros2-gbp/${PN}-release/archive/release/crystal/${PN}/1.0.8-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "522cafb80356c7e1488ce0f83eb9f290"
SRC_URI[sha256sum] = "4ad70c34ca0db3146a4b1eaf0cefb85ffceb28087da57e4b0fd06345607d5935"
S = "${WORKDIR}/${PN}-release-release-crystal-${PN}-1.0.8-0"

inherit catkin
