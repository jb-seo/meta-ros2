# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Generic joystick teleop for twist robots."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "geometry-msgs rclcpp sensor-msgs"
SRC_URI = "https://github.com/ros2-gbp/teleop_twist_joy-release/archive/release/bouncy/teleop_twist_joy/2.1.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "dfba91ed0f9dfa94f85ea279c1cd4409"
SRC_URI[sha256sum] = "d2aa20f24742dd110f441a47da19d30c4ac5d8bcd8e2493790d2fa4c97ffba5f"
S = "${WORKDIR}/teleop_twist_joy-release-release-bouncy-teleop_twist_joy-2.1.0-0"

inherit ros
inherit ament


