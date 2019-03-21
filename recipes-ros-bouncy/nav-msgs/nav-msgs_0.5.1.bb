# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A package containing some navigation related message and service definitions."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "builtin-interfaces geometry-msgs rosidl-default-generators rosidl-default-runtime std-msgs"
SRC_URI = "https://github.com/ros2-gbp/common_interfaces-release/archive/release/bouncy/nav_msgs/0.5.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "6f60c1a9eb9d4f45a66c7e0ceb7d0f5e"
SRC_URI[sha256sum] = "ae9ecf2be857ff11932b21dae1550faf266ad14eb5c2cc2ff945c9731e988bdc"
S = "${WORKDIR}/common_interfaces-release-release-bouncy-nav_msgs-0.5.1-0"

inherit ros
inherit ament


