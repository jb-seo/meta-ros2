# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Package containing a prototype for lifecycle implementation"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "lifecycle-msgs rcl-lifecycle rclcpp rclpy rmw-implementation rosidl-default-generators rosidl-default-runtime std-msgs"
SRC_URI = "https://github.com/ros2-gbp/rclcpp-release/archive/release/bouncy/rclcpp_lifecycle/0.5.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "bb3acf3175f4ecc57bdc180892b7ab8e"
SRC_URI[sha256sum] = "0356d7c777ef57a1bd30797e0784c4920a452f7c0f4abc2fdd6d7d4cbdbbdf29"
S = "${WORKDIR}/rclcpp-release-release-bouncy-rclcpp_lifecycle-0.5.1-0"

inherit ros
inherit ament


