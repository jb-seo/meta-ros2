# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Command line tools for managing SROS2 keys"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "ros2cli openssl"
SRC_URI = "https://github.com/ros2-gbp/${PN}-release/archive/release/bouncy/${PN}/0.5.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "f32494a8d70e72346e5a39d3bfbcd628"
SRC_URI[sha256sum] = "00a363fc039fa14fb0aa6ddce2ee8711eebbf6fb210dbac11b5c7d763911c151"
S = "${WORKDIR}/${PN}-release-release-bouncy-${PN}-0.5.0-0"

inherit ros
inherit setuptools3


