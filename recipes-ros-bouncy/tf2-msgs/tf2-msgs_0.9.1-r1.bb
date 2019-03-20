# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "tf2_msgs"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "builtin-interfaces geometry-msgs rosidl-default-generators rosidl-default-runtime"
SRC_URI = "https://github.com/ros2-gbp/geometry2-release/archive/release/bouncy/tf2_msgs/0.9.1-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "95cfcf0800a25cf3006364a35d124785"
SRC_URI[sha256sum] = "bacfeeaff57c15a9f204c44685986a8bef84651eb03434897cf838feb5d9ded3"
S = "${WORKDIR}/geometry2-release-release-bouncy-tf2_msgs-0.9.1-1"


inherit ros
inherit ament
inherit pythonpath-insane

