# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Package containing various utility types and functions for C"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "libyaml rcl rcutils libyaml"
SRC_URI = "https://github.com/ros2-gbp/rcl-release/archive/release/bouncy/rcl_yaml_param_parser/0.5.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "8715b6b23751872a900cefc276af9632"
SRC_URI[sha256sum] = "b259743b0344d5c8807b34740b5ef3e297d25f110f87dcbcbf5de270b9f119fc"
S = "${WORKDIR}/rcl-release-release-bouncy-rcl_yaml_param_parser-0.5.1-0"


inherit ros
inherit ament

