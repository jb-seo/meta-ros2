# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The ROS launch tool."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "osrf-pycommon"
SRC_URI = "https://github.com/ros2-gbp/${PN}-release/archive/release/bouncy/${PN}/0.6.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "b25df619df0bf6180d03e1def81c4f87"
SRC_URI[sha256sum] = "35b964b08d3d1a0e06d4d73473791c194ab89f18ddece065aa9ee3cb4752f54e"
S = "${WORKDIR}/${PN}-release-release-bouncy-${PN}-0.6.0-0"


inherit ros
inherit setuptools3

