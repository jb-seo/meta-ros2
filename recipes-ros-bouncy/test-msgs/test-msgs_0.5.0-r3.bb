# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A package containing message definitions and fixtures used exclusively for testing purposes."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "builtin-interfaces rosidl-default-generators rosidl-default-runtime"
SRC_URI = "https://github.com/ros2-gbp/rcl_interfaces-release/archive/release/bouncy/test_msgs/0.5.0-3.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "7b32b77851d0d84a10ee5063931e9d0d"
SRC_URI[sha256sum] = "d2e892276f6ddd68105ce7d85ddd4ac835f733dd12f3bf861e6462f815f554f1"
S = "${WORKDIR}/rcl_interfaces-release-release-bouncy-test_msgs-0.5.0-3"


inherit ros
inherit ament
inherit pythonpath-insane

