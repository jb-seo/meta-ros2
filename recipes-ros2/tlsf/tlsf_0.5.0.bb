# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "TLSF allocator version 2.4.6"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "LGPL-2.1"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=3badeab1074cb0c993003745c15d12f0"

DEPENDS = ""
SRC_URI = "https://github.com/ros2-gbp/${PN}-release/archive/release/crystal/${PN}/0.5.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "9070e2ebeccfe3d0c01b01126eedbc87"
SRC_URI[sha256sum] = "fb30080b58ef1610f857ff1ddcf1416325f24a247267e2c49f09a5759ab919a7"
S = "${WORKDIR}/${PN}-release-release-crystal-${PN}-0.5.0-0"

inherit ament
