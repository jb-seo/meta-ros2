# Copyright 2018 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The ROS launch tool."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "osrf-pycommon"
SRC_URI = "https://github.com/ros2-gbp/${PN}-release/archive/release/bouncy/${PN}/0.5.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "93e1390689413bf40d43640a1cce80fa"
SRC_URI[sha256sum] = "1e608cfc4708f8e4716d5350460e828f6cdb54a843e06c0f1d36532710204352"
S = "${WORKDIR}/${PN}-release-release-bouncy-${PN}-0.5.2-0"

inherit catkin
