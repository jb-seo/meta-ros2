# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The realsense_ros2_camera package"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = " builtin-interfaces cv-bridge eigen image-transport librealsense2 rclcpp realsense-camera-msgs rmw-implementation rosidl-default-generators rosidl-default-runtime sensor-msgs std-msgs tf2-ros"
SRC_URI = "https://github.com/ros2-gbp/ros2_intel_realsense-release/archive/release/crystal/realsense_ros2_camera/2.0.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "5764c60a7ee224e6c8d8d8f67c8f86c0"
SRC_URI[sha256sum] = "ccd6585ced405d85548f307ccafaffe130bbcdad898c93a6c447205304b8791d"
S = "${WORKDIR}/ros2_intel_realsense-release-release-crystal-realsense_ros2_camera-2.0.3-0"

inherit ament
