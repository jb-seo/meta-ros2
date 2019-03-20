# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A package containing some robot trajectory message definitions."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "builtin-interfaces geometry-msgs rosidl-default-generators rosidl-default-runtime std-msgs"
SRC_URI = "https://github.com/ros2-gbp/common_interfaces-release/archive/release/bouncy/trajectory_msgs/0.5.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "be9f27ea05dbd7ae164578ce315c22ac"
SRC_URI[sha256sum] = "bc7be0ee1c5bd7d00965123b4dc61a7cf75d446e92ed17e4f8a0f1d67c8df9aa"
S = "${WORKDIR}/common_interfaces-release-release-bouncy-trajectory_msgs-0.5.1-0"


inherit ros
inherit ament
inherit pythonpath-insane

