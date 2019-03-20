# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A package containing some visualization and interaction related message definitions."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "builtin-interfaces geometry-msgs rosidl-default-generators rosidl-default-runtime std-msgs"
SRC_URI = "https://github.com/ros2-gbp/common_interfaces-release/archive/release/bouncy/visualization_msgs/0.5.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "2346e8b07f39bfe655eca365af8291a4"
SRC_URI[sha256sum] = "c50ff857f0948c06a37f2c81fd1c62d71f2481a239306aeb85e8873ec9411a69"
S = "${WORKDIR}/common_interfaces-release-release-bouncy-visualization_msgs-0.5.1-0"


inherit ros
inherit ament
inherit pythonpath-insane

