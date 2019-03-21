# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Set of drivers to talk to the kobuki base."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "geometry-msgs nav-msgs rclcpp sensor-msgs tf2 tf2-ros"
SRC_URI = "https://github.com/ros2-gbp/turtlebot2_demo-release/archive/release/bouncy/turtlebot2_drivers/0.5.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "9bfc635b8861e942a0305f6e07d16273"
SRC_URI[sha256sum] = "b62ff4a671e4c853cc8585df710779f3134c081a6788d17ef7aff92a520e7a79"
S = "${WORKDIR}/turtlebot2_demo-release-release-bouncy-turtlebot2_drivers-0.5.1-0"

inherit ros
inherit ament


