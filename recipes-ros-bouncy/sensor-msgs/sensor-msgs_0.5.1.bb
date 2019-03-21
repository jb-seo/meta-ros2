# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A package containing some sensor data related message and service definitions."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "builtin-interfaces geometry-msgs rosidl-default-generators rosidl-default-runtime std-msgs"
SRC_URI = "https://github.com/ros2-gbp/common_interfaces-release/archive/release/bouncy/sensor_msgs/0.5.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "4f94e51f0a48408bf301651eb22a93cd"
SRC_URI[sha256sum] = "edf95d5a10248fa4ae1ca9052b11a93b5f1aa40a8aa4bf99eb88b6205021c8dc"
S = "${WORKDIR}/common_interfaces-release-release-bouncy-sensor_msgs-0.5.1-0"

inherit ros
inherit ament


