# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A package containing some diagnostics related message and service definitions."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "builtin-interfaces geometry-msgs rosidl-default-generators rosidl-default-runtime std-msgs"
SRC_URI = "https://github.com/ros2-gbp/common_interfaces-release/archive/release/bouncy/diagnostic_msgs/0.5.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "d1c2cb6d803a333019b3fb7cde6307c9"
SRC_URI[sha256sum] = "10d8ab93fe3556c467a72291ae80dd23da82b6af279bafee550c8c44d7df5c43"
S = "${WORKDIR}/common_interfaces-release-release-bouncy-diagnostic_msgs-0.5.1-0"


inherit ros
inherit ament
inherit pythonpath-insane

