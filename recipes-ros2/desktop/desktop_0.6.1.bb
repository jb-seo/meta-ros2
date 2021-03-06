# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A package which extends 'ros_base' and includes high level packages like vizualization tools and demos."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = " angles composition demo-nodes-cpp demo-nodes-cpp-native demo-nodes-py depthimage-to-laserscan dummy-map-server dummy-robot-bringup dummy-sensors examples-rclcpp-minimal-action-client examples-rclcpp-minimal-action-server examples-rclcpp-minimal-client examples-rclcpp-minimal-composition examples-rclcpp-minimal-publisher examples-rclcpp-minimal-service examples-rclcpp-minimal-subscriber examples-rclcpp-minimal-timer examples-rclpy-executors examples-rclpy-minimal-client examples-rclpy-minimal-publisher examples-rclpy-minimal-service examples-rclpy-minimal-subscriber image-tools intra-process-demo joy lifecycle logging-demo pcl-conversions pendulum-control ros-base rviz2 rviz-default-plugins sros2 teleop-twist-joy teleop-twist-keyboard tlsf tlsf-cpp topic-monitor"
SRC_URI = "https://github.com/ros2-gbp/variants-release/archive/release/crystal/${PN}/0.6.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "bcd871efa67d045e3f3cc7fe633ad2cb"
SRC_URI[sha256sum] = "ea16bc7630a42e64f787bf24c164a20cbc7c22c66bcfe04f248e5c1c3d7615fd"
S = "${WORKDIR}/variants-release-release-crystal-${PN}-0.6.1-0"

inherit ament
